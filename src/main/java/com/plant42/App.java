package com.plant42;

import com.plant42.drip.api.Drip;
import com.plant42.drip.api.callbacks.DeserializingCallback;
import com.plant42.drip.api.enums.Route;
import com.plant42.drip.connect.DripServiceProvider;
import com.plant42.drip.domain.Campaign;

import java.util.List;

public class App 
{
    static String API_KEY = "<API GOES HERE>";
    static String ACCOUNT_ID = "<ACCOUNT ID GOES HERE>";

    public static void main( String[] args ) throws Exception
    {
        Drip drip = DripServiceProvider.getApi();
        drip.setToken(API_KEY);
        drip.getCampaignOperations().fetch(ACCOUNT_ID, "<CAMPAIGN_ID>", deserializingCallback);

        Thread.sleep(20000);
    }

    final static DeserializingCallback<List<Campaign>> deserializingCallback = new DeserializingCallback<List<Campaign>>(Route.CAMPAIGNS) {

        @Override
        public void onSuccess() {
            System.out.println(object.toString());
        }

        @Override
        public void onFailure() {
            System.out.println(errors);
        }
    };
}
