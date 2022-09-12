case = t07

run: run-case

run-case:
	./gradlew run -Dcase=${case}
