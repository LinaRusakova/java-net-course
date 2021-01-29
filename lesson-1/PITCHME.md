# Урок 1

## Проектирование архитектуры

Анализ и обсуждение курсового проекта «Облачное хранилище»

---

## План Урока

- Обзор курса;
- Обсуждение курсового проекта «Облачное хранилище»;
- Частичный повтор тем сетевого взаимодействия, сериализации, потоков ввода/вывода при необходимости.

---

# Как организовать сетевое взаимодействие?

---

## java.io.ServerSocket/Socket;

- Пакет java.io был представлен в Java 1.0
- InputStream и OutputStream – побайтовое чтение/запись данных
- Reader и Writer – обертки для более удобной работы с чтением/записью
- blocking mode – ожидание окончания сообщения

---

## java.nio ServerSocketChannel/SocketChannel;

- Пакет java.nio был представлен в Java 1.4 и обновлен в Java 1.7
- Buffer – чтение/запись "кусками" в единицу времени
- CharsetDecoder – отображение сырых байтов в читаемые символы(кодировка)
- Selector - предоставление возможности multiplexing-а, работа с одним каналом для чтения и записи
- non-blocking mode – чтение того сколько доступно, без ожидания окончания сообщения

---

## Java фреймворк Netty.

- Фреймворк построенный по тем же принципам, что и пакет java.nio на неблокирующем чтении/записи через буфер
- ChannelOutboundHandler и ChannelInboundHandler - для потоковой обработки входящих и исходящих данных
- ByteBuf - буфер для чтения и записи

---

# Где и как хранить файлы на сервере?

- В одном каталоге и отдельно хранить мета информацию о файлах и о том какой файл какому пользователю принадлежит
- Каждому пользователю создать свой подкаталог

---