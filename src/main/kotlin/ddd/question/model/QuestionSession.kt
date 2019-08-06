class QuestionSession(target: Target) {
    val questionGrammers : Array
    init {
        createQuestionGrammers(target)
    }

    fun createQuestionGrammers(target) {
        questionGrammers = target.getQuestions(target)
    }
}