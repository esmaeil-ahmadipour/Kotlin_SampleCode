package ir.sample.kotlin_samples.sample18_enum

//Article state : Draft Waiting Published / default value is DRAFT
class Article(var status : ArticleStatus = ArticleStatus.DRAFT)

fun main(args : Array<String>) {

    PrintArticleState(Article())
    PrintArticleState(Article(ArticleStatus.WAITING))
    PrintArticleState(Article(ArticleStatus.PUBLISHED))
}

fun PrintArticleState(articleState : Article) {
    println(
        "Article State ID is: ${articleState.status.statusId} , Article State Is:  ${articleState.status}"
           )
//We Can Using statusId in Conditions  , For Handel Special Moods ;
    if(articleState.status.statusId == 0) {
        println("Yes, statusID 0 , state:Draft")
    }
}



