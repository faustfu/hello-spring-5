case = t11

run: run-case

run-case:
	./gradlew run -Dcase=${case}
