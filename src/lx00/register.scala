/**
 * このプログラムの val 登録情報 = ... で始まる登録情報の文字列修正して
 * あなたの情報に書き換えてから、このプログラムを実行して下さい。
 * 実行の出力にあなたの学籍情報等が正確に表示されることを確認できたら、
 * 修正したプログラムを wakita.k.aa-prg1@ml.m.titech.ac.jp への添付メールとして提出しなさい。
 **/

object Register {
  val 登録情報 = Map(
    "family" -> "脇田",
    "name"   -> "建",
    "id"     -> "16_01234",
    "github" -> "wakita",
    "login"  -> "wakita6",
    "email"  -> "wakita.k.aa")

  def main(arguments: Array[String]) {
    val 件名 = 登録情報("id")
    val 本文 = (for (k <- "family,name,id,github,login,email".split(",")) yield(登録情報(k))).mkString(",")

    println("\n\n1. 以下の出力が正しいかどうか確認して下さい．\n")
    println("----------------------------------------------------------------------")
    println("件名:\n" + 件名)
    println("\n本文:\n" + 本文)
    println("----------------------------------------------------------------------")
    println("参考：脇田の場合であれば，本文は以下になります．")
    println("      脇田,建,16_01234,wakita,wakita6,wakita.k.aa\n\n")

    println("2. 出力の正しさを確認したのち，電子メールのメッセージを作成し，wakita.k.aa-prg1@ml.m.titech.ac.jp 宛てに上記の要領でメッセージを完成させて，送付しなさい．\n\n")
  }
}
