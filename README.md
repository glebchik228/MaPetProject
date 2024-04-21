# MaPetProject

## Мой пет-проект.

Бекенд на микросервисной архитектуре про питомцев. Пользователи смогут регистрироваться/авторизовываться и добавлять/удалять своих питомцев с именем, описанием и т.д.

  

Планируется 3 микросервиса:
- Регистрации/аутентификации
- Взаимодействий с питомцами
- Уведомлений

На данный момент существует микросервис регистрации/аутентификации с 3 rest эндпоинтами: регистрации, аутентификации и демо-эндпоинт для проверки работоспособности. Безопасность осуществляется JWT-токеном, который выдается на сутки с момента регистрации/аутентификации. Подключил бд (MySQL), записываю в нее юзеров, пароли шифрую. 

В скором времени добавлю микросервис с основными эндпоинтами для добавлением питомцев, а в микросервисе аутентификации добавлю эндпоинт для проверки токена на валидность и refresh-token.