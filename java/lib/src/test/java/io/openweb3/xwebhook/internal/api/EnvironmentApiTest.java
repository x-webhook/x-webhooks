/*
 * Xwebhook API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 1.1.1
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package io.openweb3.xwebhook.internal.api;

import io.openweb3.xwebhook.internal.ApiException;
import io.openweb3.xwebhook.models.EnvironmentIn;
import io.openweb3.xwebhook.models.EnvironmentOut;
import io.openweb3.xwebhook.models.HTTPValidationError;
import io.openweb3.xwebhook.models.HttpErrorOut;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for EnvironmentApi
 */
@Ignore
public class EnvironmentApiTest {

    private final EnvironmentApi api = new EnvironmentApi();

    
    /**
     * Export Environment Configuration
     *
     * Download a JSON file containing all org-settings and event types
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void v1EnvironmentExportTest() throws ApiException {
        String idempotencyKey = null;
        EnvironmentOut response = api.v1EnvironmentExport(idempotencyKey);

        // TODO: test validations
    }
    
    /**
     * Export Environment Configuration
     *
     * Download a JSON file containing all org-settings and event types
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void v1EnvironmentExportGetTest() throws ApiException {
        EnvironmentOut response = api.v1EnvironmentExportGet();

        // TODO: test validations
    }
    
    /**
     * Import Environment Configuration
     *
     * Import a configuration into the active organization. It doesn&#39;t delete anything, only adds/updates what was passed to it.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void v1EnvironmentImportTest() throws ApiException {
        EnvironmentIn environmentIn = null;
        String idempotencyKey = null;
        api.v1EnvironmentImport(environmentIn, idempotencyKey);

        // TODO: test validations
    }
    
}
