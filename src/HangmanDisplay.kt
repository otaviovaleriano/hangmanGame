class HangmanDisplay {
    private val hangmanStages = listOf(
        """
          +---+
          |   |
              |
              |
              |
              |
        =========
        """,
        """
          +---+
          |   |
          O   |
              |
              |
              |
        =========
        """,
        """
          +---+
          |   |
          O   |
          |   |
              |
              |
        =========
        """,
        """
          +---+
          |   |
          O   |
         /|   |
              |
              |
        =========
        """,
        """
          +---+
          |   |
          O   |
         /|\  |
              |
              |
        =========
        """,
        """
          +---+
          |   |
          O   |
         /|\  |
         /    |
              |
        =========
        """,
        """
          +---+
          |   |
          O   |
         /|\  |
         / \  |
              |
        =========
        """
    )

    fun displayHangman(stage: Int) {
        println(hangmanStages[stage])
    }
}
