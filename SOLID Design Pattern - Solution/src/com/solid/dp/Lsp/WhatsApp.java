package com.solid.dp.Lsp;

public class WhatsApp implements SocialMedia, SocialVedioCallManager {

	@Override
	public void chatWithFriends() {
		System.out.println("WhatsApp support chat with Friends");

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
