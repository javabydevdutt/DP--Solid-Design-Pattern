package com.solid.dp.Lsp;

public class Instagram implements SocialMedia, PostMediaManager {

	@Override
	public void chatWithFriends() {
		System.out.println("Instagram support chat with Friends");

	}

	@Override
	public void publishPost(Object post) {
		System.out.println("Instagram support publish Post");

	}

	@Override
	public void sendPhotosAndVideos() {
		System.out.println("Instagram support send Photo ANd vedioes");

	}
}
