package com.solid.dp.Lsp;

public class FaceBook extends SocialMedia {

	@Override
	public void chatWithFriends() {
		System.out.println("FaceBook support chat with Friends");

	}

	@Override
	public void publishPost(Object post) {
		System.out.println("FaceBook support publish Post");

	}

	@Override
	public void sendPhotosAndVideos() {
		System.out.println("FaceBook support send Photo ANd vedioes");

	}

	@Override
	public void groupVideoCall(String... users) {
		System.out.println("FaceBook support send Photo ANd vedioes");

	}

}
