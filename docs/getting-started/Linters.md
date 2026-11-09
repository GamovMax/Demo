# Linters

Запустите flake8:

```sh
flake8 .
```

Создание образа, используя линтеры, Dockerfile.lint:

```sh
docker build -t lint -f ./Dockerfile.lint .
```

Запуск образа Dockerfile.lint:

```sh
docker run --rm lint
```

---

- [Назад (Просмотр отчёта)](Reports.md)
- [Далее (Pre-commit)](PreCommit.md)