case = t16

run: run-case

run-case:
	./gradlew run -Dcase=${case}
