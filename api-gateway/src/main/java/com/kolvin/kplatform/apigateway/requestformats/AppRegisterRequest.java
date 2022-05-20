package com.kolvin.kplatform.apigateway.requestformats;

public record AppRegisterRequest(
        String appName,
        String host
) {
}
