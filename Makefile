case = t15

run: run-case

run-case:
	./gradlew run -Dcase=${case}
