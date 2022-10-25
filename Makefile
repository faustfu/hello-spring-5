case = t22

run: run-case

run-case:
	./gradlew run -Dcase=${case}
