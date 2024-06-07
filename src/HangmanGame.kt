import kotlin.random.Random

class HangmanGame(private val wordHintProvider: WordHintProvider) {
    private val chosenWord: String = wordHintProvider.getRandomWord().uppercase()
    private val wordDisplay: CharArray = CharArray(chosenWord.length) { '_' }
    private var attemptsLeft: Int = 6
    private val guessedLetters: MutableSet<Char> = mutableSetOf()
    private val hangmanDisplay: HangmanDisplay = HangmanDisplay()

    fun start() {
        println("Welcome to The Hangman Game!!!")

        while (attemptsLeft > 0 && wordDisplay.contains('_')) {
            hangmanDisplay.displayHangman(6 - attemptsLeft)
            println("\nWord: ${wordDisplay.joinToString(" ")}")
            println("Attempts left: $attemptsLeft")
            println("Guessed letters: ${guessedLetters.joinToString(", ")}")
            print("Enter a letter (or type 'hint' for a hint): ")

            val input = readLine()?.uppercase()
            if (input == null) {
                println("Invalid input. Please enter a single letter or 'hint'.")
                continue
            }

            if (input == "HINT") {
                displayHint()
                continue
            }

            val guess = input.getOrNull(0)
            if (guess == null || !guess.isLetter()) {
                println("Invalid input. Please enter a single letter.")
                continue
            }

            if (guessedLetters.contains(guess)) {
                println("You've already guessed this letter.")
                continue
            }

            guessedLetters.add(guess)

            if (chosenWord.contains(guess)) {
                for (i in chosenWord.indices) {
                    if (chosenWord[i] == guess) {
                        wordDisplay[i] = guess
                    }
                }
                println("Good guess!")
            } else {
                attemptsLeft--
                println("Wrong guess.")
            }
        }

        hangmanDisplay.displayHangman(6 - attemptsLeft)
        if (!wordDisplay.contains('_')) {
            println("\nCongratulations! You guessed the Correct Word: $chosenWord")
        } else {
            println("\nGame over Silly! The Correct Word was: $chosenWord")
        }
    }

    private fun displayHint() {
        println("Hint: ${wordHintProvider.getHint(chosenWord.lowercase())}")
    }
}

fun main() {
    val wordHintProvider = WordHintProvider()
    val game = HangmanGame(wordHintProvider)
    game.start()
}
