case = t20

run: run-case

run-case:
	./gradlew run -Dcase=${case}
