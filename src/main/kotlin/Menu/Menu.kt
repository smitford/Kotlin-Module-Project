

enum class Menu(val menuList: String) {
    CHOSEARCHIVE(menuList = "0. Create a new archive \n1. Chose one \n2. Exit"),
    CREATEARCHIVE(menuList = "Enter name of new archive, or 0 to Go Back."),
    CHOSENOTE(menuList = "0. Create a new note \n1. Chose one  \n2. Go Back"),
    CREATENOTE(menuList = "Enter a text of the Note, or 0 to Go Back"),
    NOTEVIEW(menuList = "Type 0 to go back");

    override fun toString(): String = "- - - - - -\n\n" + menuList + "\n\n- - - - - -"

  /*  val choseArchive: (name: String) -> Archive? =
        { name -> ArchiveCollection.choseArchive(name) }

    // Ф-ия возращает выбранную пользователем записку. Выбор производится по средствам ввода названия записки
    val choseNote: (name: String, archive: Archive) -> Note? =
        { name, archive -> archive.choseNote(name) }

   */
}

