package com.plant42.drip.connect;

import com.plant42.drip.api.Drip;
import com.plant42.drip.api.impl.DripTemplate;

public class DripServiceProvider {
    final static Drip template = new DripTemplate();

    public final static Drip getApi() {
        return template;
    }
}
