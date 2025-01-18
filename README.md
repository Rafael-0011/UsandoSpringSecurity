# Gerando Chaves RSA para o Sistema

Este sistema utiliza **Spring Security** com **JWT (JSON Web Tokens)** para autenticação e controle de acesso. Para garantir a segurança, é necessário gerar um par de chaves RSA (privada e pública) para assinar e validar os tokens JWT.

## Passos para Gerar as Chaves

### 1. Gerar a Chave Privada (private.key)

Primeiro, crie a chave privada RSA, que será usada para assinar os tokens JWT no backend.

Execute o seguinte comando para gerar a chave privada de 2048 bits:

```bash
openssl genpkey -algorithm RSA -out private.key -pkeyopt rsa_keygen_bits:2048
openssl rsa -pubout -in private.key -out public.key
