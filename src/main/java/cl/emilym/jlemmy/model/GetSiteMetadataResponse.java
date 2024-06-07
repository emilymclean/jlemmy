// This class was generated, do not modify it directly
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