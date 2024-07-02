package net.raquezha.nuecagram.webhook

class RandomCommentMessage {
    private val commentMessages =
        mutableListOf(
            "dropped a comment on the",
            "commented on the",
            "left a note on the",
            "wanted to add some thoughts on the",
            "has a question about the",
            "needs clarification on the",
            "suggested a change to the",
            "proposed an update to the",
            "fixed a typo in the",
            "shared a helpful resource for the",
            "identified an issue with the",
            "provided feedback on the",
            "requested changes for the",
            "reviewed the",
            "pointed out an improvement for the",
            "highlighted an issue with the",
            "noted the",
            "asked for more details on the",
            "raised a concern about the",
            "offered suggestions for the",
            "notified about the",
            "made a suggestion for the",
            "addressed a concern with the",
            "inquired about the",
            "submitted a comment on the",
            "replied with feedback on the",
            "voiced a suggestion for the",
            "requested clarification on the",
            "chimed in on the",
            "requested a review of the",
            "added a note to the",
            "included thoughts on the",
            "shared insights on the",
            "raised a point about the",
            "highlighted a concern with the",
            "commented with suggestions on the",
            "noted a potential problem with the",
            "commented on the implementation of the",
            "shared thoughts about the",
            "commented on the progress of the",
            "requested an update on the",
            "suggested improvements for the",
            "pointed out a flaw in the",
            "asked for updates on the",
            "commented on the quality of the",
            "noted concerns with the",
            "requested more information on the",
            "noted a concern with the",
            "asked a question about the",
            "provided input on the",
            "offered a perspective on the",
            "requested feedback on the",
            "commented on the",
        )
    private var currentIndex = 0

    init {
        commentMessages.shuffle()
    }

    fun getRandomComment(): String {
        val comment = commentMessages[currentIndex]
        currentIndex = (currentIndex + 1) % commentMessages.size
        return comment
    }
}
