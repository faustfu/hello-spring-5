case = t05

run: run-case

run-case:
	./gradlew run -Dcase=${case}
