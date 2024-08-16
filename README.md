# 🌟 Prototipo-OpenAI

Benvenuto nel repository del progetto **Prototipo-OpenAI**! 🚀

Questo progetto è un prototipo di servizio REST sviluppato con Spring Boot, che utilizza le API di OpenAI per fornire risposte a prompt inviati dagli utenti.

## 📝 Descrizione

Il progetto consiste in un'applicazione Spring Boot che espone un endpoint `/chat` per inviare richieste di chat e ricevere risposte generate utilizzando le API di OpenAI.

### Caratteristiche principali:
- 🌐 **Endpoint REST** per inviare richieste di chat.
- 🧠 **Integrazione con OpenAI** per ottenere risposte AI.
- 💻 **Semplice da eseguire** utilizzando Maven.

## 🛠️ Dipendenze principali
Le dipendenze principali utilizzate nel progetto includono:

- Spring Boot Starter Web: per costruire l'applicazione web.
- Langchain4j: per l'integrazione con OpenAI.
- Lombok: per ridurre il boilerplate nel codice (opzionale).
- Jackson: per la gestione della serializzazione/deserializzazione JSON.

## 🚀 Avvio del Progetto
**Prerequisiti**

Assicurati di avere installato:

- JDK 17 o superiore ☕
- Maven 🛠️

## ⚙️ Esecuzione
  Per avviare il progetto, esegui i seguenti comandi:
  ```sh
  mvn clean install
  mvn spring-boot:run
  ```
## 🛠️ Configurazione delle Variabili d'Ambiente

Per eseguire correttamente questo progetto, è necessario configurare alcune variabili d'ambiente. Segui questi passaggi:

1. **Crea un file `.env`** 📄 nella directory principale del progetto.
2. **Aggiungi la tua chiave API OpenAI** 🔑 nel file `.env` come segue:
   ```plaintext
   OPENAI_API_KEY=your_actual_api_key
   ```

## 🔍 Esempio di Richiesta
```
GET /chat
Content-Type: application/json

{
    "id": 1,
    "message": "Ciao!"
}
```

