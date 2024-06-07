// This class was generated on 2024-06-07 10:43:43.211794+00:00, do not modify it directly
package cl.emilym.jlemmy.model;

import com.google.gson.annotations.SerializedName;
        
public class GetSiteMetadataResponse {
	private LinkMetadata metadata;

	public GetSiteMetadataResponse(LinkMetadata metadata) {
		this.metadata = metadata;
	}

	public LinkMetadata getMetadata() {
	    return metadata;
	}

	public void setMetadata(LinkMetadata metadata) {
	    this.metadata = metadata;
	}
}