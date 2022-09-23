package com.solid.dp.Lsp;

public class WhatsApp extends SocialMedia {

	@Override
	public void chatWithFriends() {
		System.out.println("WhatsApp support chat with Friends");

	}

	@Override // not-accepted
	public void publishPost(Object post) {
		System.out.println("WhatsApp not-support publish Post");

	}

	@Override
	public void sendPhotosAndVideos() {
		System.out.println("WhatsApp support send Photo ANd vedioes");

	}

	@Override
	public void groupVideoCall(String... users) {
		System.out.println("WhatsApp support send Photo ANd vedioes");

	}

}
