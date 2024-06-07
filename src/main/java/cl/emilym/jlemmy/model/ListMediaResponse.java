// This class was generated on 2024-06-07 10:43:43.211794+00:00, do not modify it directly
package cl.emilym.jlemmy.model;

import com.google.gson.annotations.SerializedName;
        
public class ListMediaResponse {
	private LocalImageView[] images;

	public ListMediaResponse(LocalImageView[] images) {
		this.images = images;
	}

	public LocalImageView[] getImages() {
	    return images;
	}

	public void setImages(LocalImageView[] images) {
	    this.images = images;
	}
}