T.java
====

## 何か
プロコンで使うこを想定したJava用テンプレート。
Aizu Online judge (AOJ)での利用を想定。たぶんAtCoderとかCodeforcesでも使える。

## 特徴
* クラス名の名前変更が不要
* よく使う標準出力は短く書ける (println, print, printf)
* Scannerを使った標準入力を短く書ける
* until, toでループを短く書ける (実行時間やメモリ制約のゆるい問題での利用を想定)

## 依存
* jdk1.5.0以上

## AOJでの使用例

準備

    $ wget https://raw.githubusercontent.com/kioa/T/master/T.java

コーディング

    $ cp T.java AOJ0000.java
    $ emacs AOJ0000.java
     # edit 
    $ diff AOJ0000.java T.java

テスト

    $ javac Main.java
    $ java Main
    1x1=1
    ...
    9x9=81

提出例

    $ AOJ_ID="your id"
    $ AOJ_PASS="your pass"  # パスワードを平文で利用することはセキュリティ上の問題があるためお勧めできません
    $ AOJ_SRC=`cat A0000.cpp | perl -MURI::Escape -lne 'print uri_escape($_)' | sed "s/%20/+/g" | sed "s/%28/(/g" | sed "s/%29/)/g" | sed "s/%2A/*/g" | sed ':loop; N; $!b loop; ;s/\n/%0A/g'`
    $ AOJ_LANG=`echo C++ | perl -MURI::Escape -lne 'print uri_escape($_)'`
    $ AOJ_PROB="0000"
    $ wget -O - --save-cookies=cookie.txt --post-data="loginUserID=${AOJ_ID}&loginPassword=${AOJ_PASS}&submit=Sign+in" --keep-session-cookies http://judge.u-aizu.ac.jp/onlinejudge/status.jsp
    $ wget -O - --load-cookies=cookie.txt --post-data="userID=${AOJ_ID}&password=${AOJ_PASS}&problemNO=${AOJ_PROB}&lessonID=&language=${AOJ_LANG}&sourceCode=${AOJ_SRC}" http://judge.u-aizu.ac.jp/onlinejudge/webservice/submit
    $ wget -O - "http://judge.u-aizu.ac.jp/onlinejudge/webservice/status_log?user_id=${AOJ_ID}" | less

## エイリアス

    $ alias jj='javac'
    $ alias j='java'
    $ alias jr='j Main'

とかすると気持ちが良い。
