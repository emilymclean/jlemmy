// This class was generated on 2024-05-10 10:12:35.913366+00:00, do not modify it directly
package cl.emilym.jlemmy.model;
        
public enum ModlogActionType {
	@SerializedName("All")
	ALL,
	@SerializedName("ModRemovePost")
	MOD_REMOVE_POST,
	@SerializedName("ModLockPost")
	MOD_LOCK_POST,
	@SerializedName("ModFeaturePost")
	MOD_FEATURE_POST,
	@SerializedName("ModRemoveComment")
	MOD_REMOVE_COMMENT,
	@SerializedName("ModRemoveCommunity")
	MOD_REMOVE_COMMUNITY,
	@SerializedName("ModBanFromCommunity")
	MOD_BAN_FROM_COMMUNITY,
	@SerializedName("ModAddCommunity")
	MOD_ADD_COMMUNITY,
	@SerializedName("ModTransferCommunity")
	MOD_TRANSFER_COMMUNITY,
	@SerializedName("ModAdd")
	MOD_ADD,
	@SerializedName("ModBan")
	MOD_BAN,
	@SerializedName("ModHideCommunity")
	MOD_HIDE_COMMUNITY,
	@SerializedName("AdminPurgePerson")
	ADMIN_PURGE_PERSON,
	@SerializedName("AdminPurgeCommunity")
	ADMIN_PURGE_COMMUNITY,
	@SerializedName("AdminPurgePost")
	ADMIN_PURGE_POST,
	@SerializedName("AdminPurgeComment")
	ADMIN_PURGE_COMMENT
}