package com.plant42.drip.api.impl;


import com.fasterxml.jackson.databind.ObjectMapper;
import com.plant42.drip.api.Drip;
import com.plant42.drip.api.impl.json.DripModule;
import com.plant42.drip.api.impl.operations.*;
import com.plant42.drip.api.impl.templates.*;
import com.plant42.drip.interceptors.HttpLoggingInterceptor;
import okhttp3.*;
import retrofit2.Retrofit;
import retrofit2.converter.jackson.JacksonConverterFactory;

import java.io.IOException;
import java.util.concurrent.TimeUnit;


public class DripTemplate implements Drip {

    public static final String TAG = "DRIPTEMPLATE";
    public static final String SCHEME = "https";
    public static final String HOSTNAME = "api.getdrip.com";
    public static final MediaType JSON = MediaType.parse("application/json; charset=utf-8");

    private AccountOperations accountOperations;

    private BroadcastOperations broadcastOperations;
    private CampaignOperations campaignOperations;
    private SubscriberOperations subscriberOperations;
    private ConversionOperations conversionOperations;
    private UserOperations userOperations;
    private CustomFieldOperations customFieldOperations;
    private TagOperations tagOperations;
    private FormOperations formOperations;
    private EventOperations eventOperations;
    private WorkflowOperations workflowOperations;
    private WebhookOperations webhookOperations;

    private ObjectMapper objectMapper;

    private OkHttpClient client;
    private Retrofit retrofit;

    public DripTemplate() {

        initObjectMapper();

        initRetrofit();

        initSubApis();


    }

    private void initRetrofit() {
        OkHttpClient.Builder httpClient = new OkHttpClient.Builder();
        httpClient.addInterceptor(new Interceptor() {
            @Override
            public Response intercept(Interceptor.Chain chain) throws IOException {
                Request original = chain.request();

                // Request customization: add request headers
                Request.Builder requestBuilder = original.newBuilder()
                        .header("Accept", "application/json")
                        .header("Content-Type","application/json");

                Request request = requestBuilder.build();
                return chain.proceed(request);
            }
        });


        long nsEnd = System.nanoTime();


        HttpLoggingInterceptor logging = new HttpLoggingInterceptor();
        logging.setLevel(HttpLoggingInterceptor.Level.HEADERS);



       httpClient
                .cache(null)
                .retryOnConnectionFailure(true)
                .connectTimeout(5, TimeUnit.SECONDS)
                .readTimeout(5, TimeUnit.SECONDS)
                .writeTimeout(5, TimeUnit.SECONDS)
                .addInterceptor(logging);

        client = httpClient.build();


        this.retrofit = new Retrofit.Builder()

                .baseUrl(getHostname())
                .client(client)
                .addConverterFactory(JacksonConverterFactory.create())
                .build();
    }

    private void initObjectMapper() {
        this.objectMapper  = new com.fasterxml.jackson.databind.ObjectMapper();
        this.objectMapper.registerModule(new DripModule());
    }

    private void initSubApis() {
        this.accountOperations = new AccountTemplate(retrofit, client, objectMapper);
        this.broadcastOperations = new BroadcastTemplate(retrofit, client, objectMapper);
        this.campaignOperations = new CampaignTemplate(retrofit, client, objectMapper);
        this.subscriberOperations = new SubscriberTemplate(retrofit, client, objectMapper);
        this.conversionOperations = new ConversionTemplate(retrofit, client, objectMapper);
        this.userOperations = new UserTemplate(retrofit, client, objectMapper);
        this.customFieldOperations = new CustomFieldTemplate(retrofit, client, objectMapper);
        this.tagOperations = new TagTemplate(retrofit, client, objectMapper);
        this.formOperations = new FormTemplate(retrofit, client, objectMapper);
        this.eventOperations = new EventTemplate(retrofit, client, objectMapper);
        this.workflowOperations = new WorkflowTemplate(retrofit, client, objectMapper);
        this.webhookOperations = new WebhookTemplate(retrofit, client, objectMapper);


    }

    private String getHostname() {
        return String.format("%s://%s/", SCHEME, HOSTNAME);
    }


    @Override
    public void setToken(String token) {
        ((AbstractTemplate)this.accountOperations).setToken(token);
        ((AbstractTemplate)this.broadcastOperations).setToken(token);
        ((AbstractTemplate)this.campaignOperations).setToken(token);
        ((AbstractTemplate)this.subscriberOperations).setToken(token);
        ((AbstractTemplate)this.conversionOperations).setToken(token);
        ((AbstractTemplate)this.userOperations).setToken(token);
        ((AbstractTemplate)this.customFieldOperations).setToken(token);
        ((AbstractTemplate)this.tagOperations).setToken(token);
        ((AbstractTemplate)this.formOperations).setToken(token);
        ((AbstractTemplate)this.eventOperations).setToken(token);
        ((AbstractTemplate)this.workflowOperations).setToken(token);
        ((AbstractTemplate)this.webhookOperations).setToken(token);
    }

    @Override
    public AccountOperations getAuthenticationOperations() {
        return this.accountOperations;
    }


    @Override
    public BroadcastOperations getBroadcastOperations() {
        return this.broadcastOperations;
    }
    public CampaignOperations getCampaignOperations() {
        return this.campaignOperations;
    }
    public SubscriberOperations getSubscriberOperations() {
        return this.subscriberOperations;
    }
    public ConversionOperations getConversionOperations() {
        return this.conversionOperations;
    }
    public UserOperations getUserOperations() {
        return this.userOperations;
    }
    public CustomFieldOperations getCustomFieldOperations() {
        return this.customFieldOperations;
    }
    public TagOperations getTagOperations() {
        return this.tagOperations;
    }
    public FormOperations getFormOperations() {
        return this.formOperations;
    }
    public EventOperations getEventOperations() {
        return this.eventOperations;
    }
    public WorkflowOperations getWorkflowOperations() {
        return this.workflowOperations;
    }
    public WebhookOperations getWebhookOperations() {
        return this.webhookOperations;
    }

    public void shutdown() {
    }
}
