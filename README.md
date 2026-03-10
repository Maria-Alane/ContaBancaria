# Conta Bancária em Java

Este projeto foi desenvolvido como parte do **Bootcamp Accenture - Desenvolvimento Java & Cloud**.

O objetivo do exercício é criar um sistema simples de **conta bancária em Java**, permitindo realizar operações básicas enquanto aplica regras de negócio para **cheque especial**.

## Funcionalidades

- Consultar saldo
- Consultar cheque especial
- Depositar dinheiro
- Sacar dinheiro
- Pagar boleto
- Verificar se a conta está usando cheque especial

## Regras de Negócio

- A conta possui um **limite de cheque especial** somado ao saldo.
- O valor do cheque especial é definido no momento da criação da conta:
  - Depósitos **até R$500,00** → cheque especial de **R$50,00**
  - Depósitos **acima de R$500,00** → cheque especial de **50% do valor depositado**
- Caso o cheque especial seja utilizado, será cobrada uma **taxa de 20% sobre o valor utilizado** quando houver saldo disponível.

## Tecnologias

- Java
- Programação Orientada a Objetos

## Menu Interativo
  <img width="328" height="218" alt="image" src="https://github.com/user-attachments/assets/ff1d4bad-dd82-4ce4-ab02-3c721e75942a" />
