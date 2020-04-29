# はじめに
Kotlinで競技プログラミングにチャレンジしてみた

# 挑戦サイト
## AOJ
https://onlinejudge.u-aizu.ac.jp/home
### 実績
http://judge.u-aizu.ac.jp/onlinejudge/user.jsp?id=ValJapan#2
## AC
https://atcoder.jp/?lang=ja

# コード
## メイン関数
```main.kt
fun main(args: Array<String>) {
  // 処理
}
```

# 入力
## 文字列の入力
```main.kt
val str = readLine()!!
```

## 数値の入力
```main.kt
val int =readLine()!!.toInt()
```

## １行に複数項目
```main.kt
val (a,b) = readLine()!!.split(" ")
```
数値はこちら
```main.kt
val (a,b) = readLine()!!.split(" ").map(String::toInt)
```
複数行の入力
```main.kt
Array(n){
  readLine()!!.toInt()
}
```

# 出力
```main.kt
println(str)
```

コードを流れるように書きたい場合は、スコープ関数のletと関数参照を使うと次のように書けます。
```main.kt
val str = "Hello World!"
str.let(::println)
```

# for
## 0からnまでの数値をfor文で回すとき
```main.kt
for(i in 0..n){
  // 処理
}
```

## 0からn-1までの数値を増やしていくとき
```main.kt
for(i in 0 until n){
  // 処理
}
```

## nから0までの数値を減らしていくとき
```main.kt
for (i in n downTo 0) {
  // 処理
}
```

## 0からnまで2ずつ増やしていきたいとき
```main.kt
for (i in 0..n step 2) {
    // 処理
}
```

## CollectionやArrayの添字をfor文で回すとき
```main.kt
val list = listOf(1, 2, 3, 4, 5)
for (i in list.indices) {
    // 処理 
}
```

# foreach
## List
```main.kt
val list = listOf(1, 2, 3, 4, 5)
for (str in list) {
    // 処理
}
```

## Map
```main.kt
val map = mapOf(1 to "one", 2 to "two")
for ((key, value) in map) {
     // 処理
}
```

# その他
## 値が範囲内かどうか
```main.kt
val n = 10
val min = 0
val max =100
if (n in min..max) {
    // 処理
}
```

## 多次元配列の作成
```main.kt
val array = Array(9) {
    IntArray(9)
}
```

## 参考文献
https://ikkun2501.hatenablog.com/entry/2019/11/01/205553
