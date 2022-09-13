case = t08

run: run-case

run-case:
	./gradlew run -Dcase=${case}
