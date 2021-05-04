package org.petstore.resources;

public enum APIResources {
    postOrderApi("/v2/store/order"),
    getOrderApi("/v2/store/order/{orderId}"),
    deleteOrderApi("/v2/store/order/{orderId}");

    private String resource;

    APIResources(String resource) {
        this.resource = resource;
    }
    public String getResource() {
        return resource;
    }
}
