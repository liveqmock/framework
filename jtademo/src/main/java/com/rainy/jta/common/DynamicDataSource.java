package com.rainy.jta.common;

import org.springframework.jdbc.datasource.lookup.AbstractRoutingDataSource;  
public class DynamicDataSource extends AbstractRoutingDataSource {

	@Override  
    protected Object determineCurrentLookupKey() {
        return DataSourceSwitcher.getDataSource();
    }  
}
