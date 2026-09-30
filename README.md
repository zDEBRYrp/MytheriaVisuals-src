# MytheriaVisuals 2.1.0 для Minecraft 1.21.4

Исходный код MytheriaVisuals 2.1.0 для Minecraft 1.21.4.

Telegram-канал проекта: [@mytheriavisuals](https://t.me/mytheriavisuals)

## Структура

- `src/main/java` - Java-код проекта;
- `src/main/resources` - ресурсы мода;
- `tools/FixMixins.java` - утилита для обработки mixin-классов;
- `libs/` - локальные бинарные зависимости, не публикуемые в Git.

Часть классов была обфусцирована до потери исходников, поэтому отдельные имена и некоторые методы требуют ручного восстановления.

## Запуск клиента

Положите локальный файл `Mytheria-2_1-free.jar` в `libs/`, затем выполните:

```powershell
.\gradlew.bat runClient
```

Бинарные JAR-файлы исключены из Git через `.gitignore`.
