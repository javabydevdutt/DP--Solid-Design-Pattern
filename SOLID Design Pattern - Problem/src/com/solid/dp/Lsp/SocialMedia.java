package com.solid.dp.Lsp;

public abstract class SocialMedia {

	// @support WhatsApp,Instagram,Facebook
	public abstract void chatWithFriends();

	// @support Instagram,Facebook
	public abstract void publishPost(Object post);

	// @support WhatsApp,Instagram,Facebook
	public abstract void sendPhotosAndVideos();

	// @support WhatsApp,Facebook
	public abstract void groupVideoCall(String... users);

}
