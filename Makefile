case = t13

run: run-case

run-case:
	./gradlew run -Dcase=${case}
