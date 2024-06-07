class WordHintProvider {
    private val wordHints = mapOf(
        "hogwarts" to "The school of witchcraft and wizardry in Harry Potter.",
        "dumbledore" to "The headmaster of Hogwarts in Harry Potter.",
        "voldemort" to "The dark lord and main antagonist in Harry Potter.",
        "hermione" to "One of Harry Potter's best friends.",
        "ron" to "Harry Potter's red-haired best friend.",
        "quidditch" to "A sport played on broomsticks in Harry Potter.",
        "spiderman" to "A Marvel superhero who can shoot webs.",
        "ironman" to "A Marvel superhero with an advanced suit of armor.",
        "thor" to "The Norse god of thunder and a Marvel superhero.",
        "hulk" to "A green, super-strong Marvel superhero.",
        "captainamerica" to "A Marvel superhero known for his shield.",
        "blackwidow" to "A skilled spy and Marvel superhero.",
        "frodo" to "The main character in The Lord of the Rings.",
        "gandalf" to "A powerful wizard in The Lord of the Rings.",
        "legolas" to "An elf and a member of the Fellowship of the Ring.",
        "gollum" to "A creature corrupted by the One Ring in The Lord of the Rings.",
        "aragorn" to "The king of Gondor in The Lord of the Rings.",
        "bilbo" to "The main character in The Hobbit.",
        "pikachu" to "A yellow electric-type Pokémon.",
        "charizard" to "A fire-breathing dragon-like Pokémon.",
        "bulbasaur" to "A grass/poison-type Pokémon.",
        "squirtle" to "A water-type Pokémon.",
        "jigglypuff" to "A pink, singing Pokémon.",
        "meowth" to "A cat-like Pokémon known for speaking human language."
    )

    fun getRandomWord(): String {
        return wordHints.keys.random()
    }

    fun getHint(word: String): String {
        return wordHints[word] ?: "No hint available."
    }
}
