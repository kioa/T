T.java
====

## 何か
プロコンで使うことを想定したJava用テンプレート。
簡単な問題に短時間で解答するのに使います。


## 特徴
* ファイル名が自由 (ファイル名をMain.javaにしなくてよい)
* 標準出力を短く書ける (println, print, printf)
* Scannerを使った標準入力を短く書ける
* until, toでループを短く書ける (実行時間やメモリ制約のゆるい問題での利用を想定)


## 依存
* jdk1.5.0以上


## 使用方法

コピーして

    $ cp T/T.java Solve.java

編集して

    $ emacs Solve.java

コンパイルして

    $ javac Solve.java

実行できます

    $ java Main


## ファイル名が自由

    public class Main

と書いて、Main.javaとして保存しなければならないと思い込んでいませんか？

T.javaでは、

    class Main

としているので、好きなファイル名を付けることができます。

なので、ソースコードは個別のファイル名で管理して、実行は"java Main"で統一できます。

    $ javac A0000.java
    $ java Main
    $ javac A0001.java
    $ java Main


## 標準出力を短く書ける

標準出力をタイプするのは手間です。どれだけ訓練しても手間です。

    System.out.println("hoge");

T.javaでは、

    println("hoge");

と書けます。


## 標準入力を短く書ける

標準入力のタイプも手間です。どれだけ訓練しても手間です。

    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();

T.javaでは、

    int n  = _Int();

と書けます。


## until

JavaにはC++のようなマクロ展開できるプリプロセッサがありません。repは書けません。

    for (int i=0; i<n; i++);

T.javaでは、

    for (int i : until(n))

と書けます。実行速度や消費メモリは気にしません。


## おまけ: AOJの問題0000での使用例

準備

    $ wget https://raw.githubusercontent.com/kioa/T/master/T.java

コーディング

    $ cp T.java A0000.java
    $ emacs A0000.java  # edit
    $ diff A0000.java T.java
    6,8d5
    <     for (int i : to(1,9))
    <       for (int j : to(1,9))
    <         printf("%dx%d=%d\n", i, j, i*j);

テスト

    $ javac A0000.java
    $ java Main
    1x1=1
    ...
    9x9=81

提出例

    $ AOJ_ID="your id"
    $ AOJ_PASS="your pass"
    $ AOJ_SRC=`cat A0000.java | perl -MURI::Escape -lne 'print uri_escape($_)' | sed "s/%20/+/g" | sed "s/%28/(/g" | sed "s/%29/)/g" | sed "s/%2A/*/g" | sed ':loop; N; $!b loop; ;s/\n/%0A/g'`
    $ AOJ_LANG=`echo JAVA | perl -MURI::Escape -lne 'print uri_escape($_)'`
    $ AOJ_PROB="0000"
    $ wget -O - --save-cookies=cookie.txt --post-data="loginUserID=${AOJ_ID}&loginPassword=${AOJ_PASS}&submit=Sign+in" --keep-session-cookies http://judge.u-aizu.ac.jp/onlinejudge/status.jsp
    $ wget -O - --load-cookies=cookie.txt --post-data="userID=${AOJ_ID}&password=${AOJ_PASS}&problemNO=${AOJ_PROB}&lessonID=&language=${AOJ_LANG}&sourceCode=${AOJ_SRC}" http://judge.u-aizu.ac.jp/onlinejudge/webservice/submit
    $ wget -O - "http://judge.u-aizu.ac.jp/onlinejudge/webservice/status_log?user_id=${AOJ_ID}" | less


## エイリアス

    $ alias jj='javac'
    $ alias j='java'
    $ alias jr='j Main'

とかしておくと、快適です。
