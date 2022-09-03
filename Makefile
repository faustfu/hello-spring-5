case = t04

run: run-case

run-case:
	./gradlew run -Dcase=${case}
