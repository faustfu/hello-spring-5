case = t12

run: run-case

run-case:
	./gradlew run -Dcase=${case}
