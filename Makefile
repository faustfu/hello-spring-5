case = t06

run: run-case

run-case:
	./gradlew run -Dcase=${case}
