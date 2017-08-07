cd src
javac Main.java

if [[ -z "$2" && -z "$3" ]]; then
  echo Assuming input.txt and output.txt
  java Main $1 ../input.txt ../output.txt
elif [ -z "$3" ]; then
  echo Missing argument. Try like: $ ./ordenar.sh merge input.txt output.txt
else
  java Main $1 ../$2 ../$3
fi
