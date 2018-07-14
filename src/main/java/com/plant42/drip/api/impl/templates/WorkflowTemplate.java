package com.plant42.drip.api.impl.templates;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.plant42.drip.api.callbacks.DeserializingCallback;
import com.plant42.drip.api.callbacks.NonDeserializingCallback;
import com.plant42.drip.api.impl.operations.WorkflowOperations;
import com.plant42.drip.api.impl.services.WorkflowService;
import com.plant42.drip.domain.Trigger;
import com.plant42.drip.domain.Workflow;
import okhttp3.Credentials;
import okhttp3.OkHttpClient;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.Retrofit;

import java.util.List;

public class WorkflowTemplate extends AbstractTemplate implements WorkflowOperations {

    public WorkflowTemplate(Retrofit retrofit, OkHttpClient client, ObjectMapper objectMapper) {
        super(retrofit, client, objectMapper);
    }

    @Override
    public void list(final String accountId, DeserializingCallback<List<Workflow>> callback) {

        try {
            WorkflowService service = retrofit.create(WorkflowService.class);
            Call<ResponseBody> call = service.list(Credentials.basic(this.token,""), accountId);
            call.enqueue(callback);

        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }

    @Override
    public void fetch(final String accountId, final String workflowId, final DeserializingCallback<List<Workflow>> callback) {

        try {
            WorkflowService service = retrofit.create(WorkflowService.class);
            Call<ResponseBody> call = service.fetch(Credentials.basic(this.token,""), accountId, workflowId );
            call.enqueue(callback);

        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }


    @Override
    public void triggers(final String accountId, final String workflowId, final DeserializingCallback<List<Trigger>> callback) {

        try {
            WorkflowService service = retrofit.create(WorkflowService.class);
            Call<ResponseBody> call = service.triggers(Credentials.basic(this.token,""), accountId, workflowId );
            call.enqueue(callback);

        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }


    @Override
    public void activate(final String accountId, final String workflowId, final NonDeserializingCallback callback) {

        try {
            WorkflowService service = retrofit.create(WorkflowService.class);
            Call<ResponseBody> call = service.activate(Credentials.basic(this.token,""), accountId, workflowId );
            call.enqueue(callback);

        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }


    @Override
    public void pause(final String accountId, final String workflowId, final NonDeserializingCallback callback) {

        try {
            WorkflowService service = retrofit.create(WorkflowService.class);
            Call<ResponseBody> call = service.pause(Credentials.basic(this.token,""), accountId, workflowId );
            call.enqueue(callback);

        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }
}
