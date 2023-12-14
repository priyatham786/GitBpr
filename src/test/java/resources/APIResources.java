package resources;

public enum APIResources {
	Addplaceapi("/maps/api/place/add/json"),
	Getplaceapi("/maps/api/place/get/json"),
	Deleteplaceapi("/maps/api/place/delete/json");
	private String resource;
	APIResources(String resource)
	{
this.resource=resource;
}
	public String getResource() {
		return resource;
	}
}