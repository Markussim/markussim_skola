#/bin/bash/

sed '1s/^/\/\//' MainCountdown.java >> ./out/MainCountdown.java;
cd ./out;
javac MainCountdown.java;
rm MainCountdown.java;
cd ..;
