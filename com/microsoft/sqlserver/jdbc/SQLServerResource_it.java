package com.microsoft.sqlserver.jdbc;

import java.util.ListResourceBundle;

public final class SQLServerResource_it extends ListResourceBundle {

   static final Object[][] contents = new Object[][]{{"R_timedOutBeforeRouting", "Timeout scaduto prima della connessione alla destinazione di routing."}, {"R_invalidRoutingInfo", "Ricevute informazioni di routing impreviste. Controllare le proprietà di connessione e la configurazione di SQL Server."}, {"R_multipleRedirections", "Si sono verificati due o più reindirizzamenti. È consentito un solo reindirizzamento per tentativo di accesso."}, {"R_dbMirroringWithMultiSubnetFailover", "La connessione a un\'istanza di SQL Server con mirroring utilizzando la proprietà di connessione multiSubnetFailover non è supportata."}, {"R_dbMirroringWithReadOnlyIntent", "La connessione a un\'istanza di SQL Server con mirroring utilizzando la proprietà di connessione ApplicationIntent ReadOnly non è supportata."}, {"R_ipAddressLimitWithMultiSubnetFailover", "La connessione a un\'\'istanza di SQL Server configurata con più di {0} indirizzi IP utilizzando la proprietà di connessione multiSubnetFailover non è supportata."}, {"R_connectionTimedOut", "Timeout della connessione: nessuna ulteriore informazione"}, {"R_invalidPositionIndex", "L\'\'indice di posizione {0} non è valido."}, {"R_invalidLength", "La lunghezza {0} non è valida."}, {"R_unknownSSType", "Tipo di dati SQL Server {0} non valido."}, {"R_unknownJDBCType", "Tipo di dati JDBC {0} non valido."}, {"R_notSQLServer", "Il driver ha ricevuto una risposta di preaccesso imprevista. Verificare le proprietà di connessione e assicurarsi che un\'istanza di SQL Server sia in esecuzione sull\'host e accetti le connessioni TCP/IP alla porta. È possibile utilizzare il driver solo con SQL Server 2000 o versione successiva."}, {"R_tcpOpenFailed", "{0}. Verificare le proprietà di connessione. Assicurarsi che un\'\'istanza di SQL Server sia in esecuzione sull\'\'host e accetti le connessioni TCP/IP alla porta. Verificare inoltre che le connessioni TCP alla porta non siano bloccate da un firewall."}, {"R_unsupportedJREVersion", "Java Runtime Environment (JRE) versione {0} non è supportato dal driver. Utilizzare la libreria di classi sqljdbc4.jar, che fornisce supporto per JDBC 4.0."}, {"R_unsupportedServerVersion", "SQL Server versione {0} non è supportato dal driver."}, {"R_noServerResponse", "Nessuna risposta restituita da SQL Server. La connessione è stata chiusa."}, {"R_truncatedServerResponse", "Risposta incompleta restituita da SQL Server. La connessione è stata chiusa."}, {"R_queryTimedOut", "Timeout della query."}, {"R_queryCancelled", "La query è stata annullata."}, {"R_errorReadingStream", "Si è verificato un errore durante la lettura del valore dall\'\'oggetto flusso. Errore: \"{0}\""}, {"R_streamReadReturnedInvalidValue", "L\'operazione di lettura del flusso ha restituito un valore non valido per la quantità di dati letti."}, {"R_mismatchedStreamLength", "Il valore del flusso non è della lunghezza specificata. La lunghezza specificata era {0}, la lunghezza attuale è {1}."}, {"R_notSupported", "Questa operazione non è supportata."}, {"R_invalidOutputParameter", "L\'\'indice {0} del parametro di output non è valido."}, {"R_outputParameterNotRegisteredForOutput", "Il parametro {0} non era registrato per l\'\'output."}, {"R_parameterNotDefinedForProcedure", "Il parametro {0} non era definito per la stored procedure {1}."}, {"R_connectionIsClosed", "La connessione è chiusa."}, {"R_invalidBooleanValue", "La proprietà {0} non contiene un valore booleano valido. È possibile utilizzare solo true e false."}, {"R_propertyMaximumExceedsChars", "La proprietà {0} supera il numero massimo di {1} caratteri."}, {"R_invalidPortNumber", "Il numero di porta {0} non è valido."}, {"R_invalidTimeOut", "Il timeout {0} non è valido."}, {"R_invalidLockTimeOut", "Il lockTimeOut {0} non è valido."}, {"R_invalidAuthenticationScheme", "authenticationScheme {0} non valido."}, {"R_invalidPacketSize", "Proprietà packetSize {0} non valida."}, {"R_packetSizeTooBigForSSL", "Impossibile utilizzare la crittografia SSL con dimensioni del pacchetto di rete maggiori di {0} byte. Verificare le proprietà della connessione e la configurazione SQL Server."}, {"R_tcpipConnectionFailed", "La connessione TCP/IP all\'\'host {0}, porta {1} non è riuscita. Errore: \"{2}\"."}, {"R_invalidTransactionLevel", "Il livello di transazione {0} non è valido."}, {"R_cantInvokeRollback", "Impossibile richiamare un\'operazione di commit quando la modalità AutoCommit è impostata su \"true\"."}, {"R_cantSetSavepoint", "Impossibile impostare un punto di salvataggio quando la modalità AutoCommit è impostata su \"true\"."}, {"R_sqlServerHoldability", "SQL Server supporta la trattenibilità soltanto al livello di connessione. Utilizzare il metodo connection.setHoldability()."}, {"R_invalidHoldability", "Il valore di trattenibilità {0} non è valido."}, {"R_invalidColumnArrayLength", "La matrice di colonna non è valida. La lunghezza dev\'essere pari a 1."}, {"R_valueNotSetForParameter", "Il valore non è impostato per il numero di parametro {0}."}, {"R_sqlBrowserFailed", "Impossibile connettersi all\'\'host {0}, istanza denominata {1}. Errore: \"{2}\". Verificare i nomi di server e di istanza e assicurarsi che nessun firewall blocchi il traffico UDP verso la porta 1434. Per SQL Server 2005 o versione successiva, verificare inoltre che il servizio SQL Server Browser sia in esecuzione sull\'\'host."}, {"R_notConfiguredToListentcpip", "Il server {0} non è configurato per l\'\'ascolto con TCP/IP."}, {"R_cantIdentifyTableMetadata", "Impossibile identificare la tabella {0} per i metadati."}, {"R_metaDataErrorForParameter", "Si è verificato un errore di metadati per il parametro {0}."}, {"R_invalidParameterNumber", "Il numero di parametro {0} non è valido."}, {"R_noMetadata", "Non sono presenti metadati."}, {"R_resultsetClosed", "Il set di risultati è chiuso."}, {"R_invalidColumnName", "Il nome di colonna {0} non è valido."}, {"R_resultsetNotUpdatable", "Il set di risultati non è aggiornabile."}, {"R_indexOutOfRange", "L\'\'indice {0} non rientra nell\'\'intervallo consentito."}, {"R_savepointNotNamed", "Il savepoint non è denominato."}, {"R_savepointNamed", "Il savepoint {0} è denominato."}, {"R_resultsetNoCurrentRow", "Il set di risultati non ha una riga corrente."}, {"R_mustBeOnInsertRow", "Il cursore non è sulla riga di inserimento."}, {"R_mustNotBeOnInsertRow", "L\'operazione richiesta non è valida sulla riga di inserimento."}, {"R_cantUpdateDeletedRow", "Non è possibile aggiornare una riga eliminata."}, {"R_noResultset", "L\'istruzione non ha restituito un set di risultati."}, {"R_resultsetGeneratedForUpdate", "È stato generato un set di risultati per l\'aggiornamento."}, {"R_statementIsClosed", "L\'istruzione è chiusa."}, {"R_invalidRowcount", "Il conteggio di righe massimo {0} per un set di risultati deve essere non negativo."}, {"R_invalidQueryTimeOutValue", "Il valore di timeout di query {0} non è valido."}, {"R_invalidFetchDirection", "La direzione di recupero {0} non è valida."}, {"R_invalidFetchSize", "La dimensione del recupero non può essere negativa."}, {"R_noColumnParameterValue", "Nessun valore di parametro di colonna specificato per aggiornare la riga."}, {"R_statementMustBeExecuted", "Per ottenere risultati è necessario eseguire l\'istruzione."}, {"R_modeSuppliedNotValid", "La modalità fornita non è valida."}, {"R_variantNotSupported", "Il tipo dati \"variant\" non è supportato."}, {"R_errorConnectionString", "La stringa di connessione contiene un nome o un valore non corretto."}, {"R_errorProcessingComplexQuery", "Si è verificato un errore durante l\'elaborazione della query complessa."}, {"R_invalidOffset", "L\'\'offset {0} non è valido."}, {"R_nullConnection", "L\'URL della connessione ha valore null."}, {"R_invalidConnection", "L\'URL della connessione non è valido."}, {"R_cannotTakeArgumentsPreparedOrCallable", "Il metodo {0} non può accettare argomenti su un PreparedStatement o un CallableStatement."}, {"R_unsupportedConversionFromTo", "La conversione da {0} a {1} non è supportata."}, {"R_errorConvertingValue", "Si è verificato un errore durante la conversione del valore {0} nel tipo di dati JDBC {1}."}, {"R_streamIsClosed", "Il flusso è chiuso."}, {"R_invalidTDS", "Il flusso del protocollo TDS non è valido."}, {"R_unexpectedToken", " Il token {0} è imprevisto."}, {"R_selectNotPermittedinBatch", "L\'istruzione SELECT non è consentita in un batch."}, {"R_failedToCreateXAConnection", "Impossibile creare la connessione al controllo XA. Errore: \"{0}\""}, {"R_codePageNotSupported", "La tabella codici {0} non è supportata dall\'\'ambiente Java."}, {"R_unknownSortId", "Le regole di confronto {0} di SQL Server non sono supportate dal driver."}, {"R_unknownLCID", "Le regole di confronto {0} di Windows non sono supportate dal driver."}, {"R_encodingErrorWritingTDS", "Si è verificato un errore di codifica durante la scrittura di una stringa nel buffer TDS. Errore: \"{0}\""}, {"R_processingError", "Si è verificato un errore di elaborazione \"{0}\"."}, {"R_requestedOpNotSupportedOnForward", "L\'operazione richiesta non è supportata sui set di risultati forward-only."}, {"R_unsupportedCursor", "Il tipo di cursore non è supportato."}, {"R_unsupportedCursorOperation", "L\'operazione richiesta non è supportata con questo tipo di cursore."}, {"R_unsupportedConcurrency", "La concorrenza non è supportata."}, {"R_unsupportedCursorAndConcurrency", "La combinazione di tipo di cursore/concorrenza non è supportata."}, {"R_stringReadError", "Si è verificato un errore di lettura di stringa all\'\'offset:{0}."}, {"R_stringWriteError", "Si è verificato un errore di scrittura di stringa all\'\'offset:{0}."}, {"R_stringNotInHex", "La stringa non è in un formato esadecimale valido."}, {"R_unknownType", "Il tipo Java {0} non è supportato."}, {"R_physicalConnectionIsClosed", "Per questa connessione in pool la connessione fisica è chiusa."}, {"R_invalidDataSourceReference", "Riferimento DataSource non valido."}, {"R_cantGetColumnValueFromDeletedRow", "Impossibile ottenere un valore da una riga eliminata."}, {"R_cantGetUpdatedColumnValue", "Impossibile accedere alle colonne aggiornate fino a quando non è stato chiamato updateRow() o cancelRowUpdates()."}, {"R_cantUpdateColumn", "Impossibile aggiornare il valore di colonna."}, {"R_positionedUpdatesNotSupported", "Le eliminazioni e gli aggiornamenti posizionati non sono supportati."}, {"R_invalidAutoGeneratedKeys", "Valore {0} del parametro autoGeneratedKeys non valido. È possibile usare solo i valori Statement.RETURN_GENERATED_KEYS e Statement.NO_GENERATED_KEYS."}, {"R_notConfiguredForIntegrated", "Il driver non è configurato per l\'autenticazione integrata."}, {"R_failoverPartnerWithoutDB", "databaseName obbligatorio quando si utilizza la proprietà di connessione failoverPartner."}, {"R_invalidPartnerConfiguration", "Il database {0} sul server {1} non è configurato per il mirroring del database."}, {"R_invaliddisableStatementPooling", "Valore {0} di disableStatementPooling non valido."}, {"R_invalidselectMethod", "Proprietà selectMethod {0} non valida."}, {"R_invalidpropertyValue", "Tipo di dati della proprietà {0} della connessione non valido. Tutte le proprietà della connessione devono essere di tipo String."}, {"R_invalidArgument", "L\'\'argomento {0} non è valido."}, {"R_streamWasNotMarkedBefore", "Il flusso non è stato contrassegnato."}, {"R_invalidresponseBuffering", "La proprietà {0} della connessione responseBuffering non è valida."}, {"R_invalidapplicationIntent", "La proprietà di connessione applicationIntent {0} non è valida."}, {"R_dataAlreadyAccessed", "Accesso ai dati eseguito. Dati non disponibili per questa colonna o questo parametro."}, {"R_outParamsNotPermittedinBatch", "Parametri OUT e INOUT non consentiti in un batch."}, {"R_sslRequiredNoServerSupport", "Impossibile stabilire una connessione protetta a SQL Server mediante la crittografia SSL (Secure Sockets Layer). La crittografia è richiesta dall\'applicazione, ma il server non è configurato per il supporto di SSL."}, {"R_sslRequiredByServer", "L\'account di accesso di SQL Server richiede una connessione crittografata che utilizza SSL (Secure Sockets Layer)."}, {"R_sslFailed", "Impossibile stabilire una connessione protetta a SQL Server mediante la crittografia SSL (Secure Sockets Layer). Errore: \"{0}\"."}, {"R_certNameFailed", "Impossibile convalidare il nome del server in un certificato durante l\'inizializzazione di SSL (Secure Sockets Layer)."}, {"R_failedToInitializeXA", "Impossibile inizializzare la stored procedure xp_sqljdbc_xa_init. Stato: {0}. Errore: \"{1}\""}, {"R_failedFunctionXA", "Funzione {0} non riuscita. Stato: {1}. Errore: \"{2}\""}, {"R_noTransactionCookie", "Funzione {0} non riuscita. Nessun cookie della transazione restituito."}, {"R_failedToEnlist", "Impossibile integrare. Errore: \"{0}\""}, {"R_failedToUnEnlist", "Impossibile rimuovere. Errore: \"{0}\""}, {"R_failedToReadRecoveryXIDs", "Impossibile leggere gli ID transazione secondari XA (XID) di recupero. Errore: \"{0}\""}, {"R_userPropertyDescription", "Utente del database."}, {"R_passwordPropertyDescription", "Password del database."}, {"R_databaseNamePropertyDescription", "Nome del database a cui connettersi."}, {"R_serverNamePropertyDescription", "Computer che esegue SQL Server."}, {"R_portNumberPropertyDescription", "Porta TCP di ascolto di un\'istanza di SQL Server."}, {"R_serverSpnPropertyDescription", "SQL Server SPN."}, {"R_sendStringParametersAsUnicodePropertyDescription", "Determina se i parametri di stringa vengono inviati al server come Unicode o come set di caratteri del database."}, {"R_multiSubnetFailoverPropertyDescription", "Indica che è in corso la connessione dell\'applicazione a un Listener gruppo di disponibilità di un Availability Group o di una Failover Cluster Instance."}, {"R_applicationNamePropertyDescription", "Nome dell\'applicazione per gli strumenti di profiling e registrazione di SQL Server."}, {"R_lastUpdateCountPropertyDescription", "Assicura che solo il conteggio aggiornamenti più recente venga restituito da un\'istruzione SQL passata al server."}, {"R_disableStatementPoolingPropertyDescription", "Disabilita la funzionalità relativa al pool di istruzioni."}, {"R_integratedSecurityPropertyDescription", "Indica se l\'autenticazione di Windows verrà utilizzata per la connessione a SQL Server."}, {"R_authenticationSchemePropertyDescription", "Schema di autenticazione da utilizzare per l\'autenticazione integrata."}, {"R_lockTimeoutPropertyDescription", "Numero di millisecondi di attesa prima che il database segnali un timeout di blocco."}, {"R_loginTimeoutPropertyDescription", "Numero di secondi di attesa da parte del driver prima del timeout di una connessione non riuscita."}, {"R_instanceNamePropertyDescription", "Nome dell\'istanza di SQL Server a cui connettersi."}, {"R_xopenStatesPropertyDescription", "Determina se il driver restituisce codici di stato SQL conformi a XOPEN nelle eccezioni."}, {"R_selectMethodPropertyDescription", "Consente all\'applicazione di utilizzare cursori server per elaborare set di risultati forward-only di sola lettura."}, {"R_responseBufferingPropertyDescription", "Controlla il comportamento della memorizzazione nel buffer adattiva per consentire all\'applicazione di elaborare set di risultati di grandi dimensioni senza la necessità di cursori server."}, {"R_applicationIntentPropertyDescription", "Dichiara il tipo di carico di lavoro dell\'applicazione durante la connessione a un server. I valori possibili sono ReadOnly e ReadWrite."}, {"R_workstationIDPropertyDescription", "Nome host della workstation."}, {"R_failoverPartnerPropertyDescription", "Nome del server secondario utilizzato in una configurazione per il mirroring del database."}, {"R_packetSizePropertyDescription", "Dimensioni del pacchetto di rete in uso per la comunicazione con SQL Server."}, {"R_encryptPropertyDescription", "Determina se è necessario utilizzare la crittografia SSL (Secure Sockets Layer) tra client e server."}, {"R_trustServerCertificatePropertyDescription", "Determina se il driver deve convalidare il certificato SSL (Secure Sockets Layer) di SQL Server."}, {"R_trustStorePropertyDescription", "Percorso del file di archivio di scopi consentiti ai certificati."}, {"R_trustStorePasswordPropertyDescription", "Password utilizzata per il controllo dell\'integrità dei dati dell\'archivio di scopi consentiti."}, {"R_hostNameInCertificatePropertyDescription", "Nome host da utilizzare per la convalida del certificato SSL (Secure Sockets Layer) di SQL Server."}, {"R_sendTimeAsDatetimePropertyDescription", "Determina se utilizzare il tipo di dati datetime di SQL Server per inviare valori java.sql.Time al database."}, {"R_noParserSupport", "Si è verificato un errore durante la creazione dell\'\'istanza del parser richiesto. Errore: \"{0}\""}, {"R_writeOnlyXML", "Impossibile leggere da questa istanza SQLXML. L\'istanza è solo per la scrittura dei dati."}, {"R_dataHasBeenReadXML", "Impossibile leggere da questa istanza SQLXML. Dati già letti."}, {"R_readOnlyXML", "Impossibile scrivere in questa istanza SQLXML. L\'istanza è solo per la lettura dei dati."}, {"R_dataHasBeenSetXML", "Impossibile scrivere in questa istanza SQLXML. Dati già impostati."}, {"R_noDataXML", "Nessun dato impostato in questa istanza SQLXML."}, {"R_cantSetNull", "Impossibile impostare un valore Null."}, {"R_failedToParseXML", "Impossibile analizzare il file XML. Errore: \"{0}\""}, {"R_isFreed", "Oggetto {0} liberato. Non è più possibile accedervi."}, {"R_invalidProperty", "Proprietà non supportata: {0}."}, {"R_referencingFailedTSP", "È necessario impostare la password trustStore DataSource."}, {"R_valueOutOfRange", "Uno o più valori non rientrano nell\'\'intervallo consentito dei valori del tipo di dati {0} SQL Server"}, {"R_integratedAuthenticationFailed", "Autenticazione integrata non riuscita."}, {"R_permissionDenied", "Violazione della sicurezza. L\'\'autorizzazione alla destinazione \"{0}\" è stata negata."}, {"R_getSchemaError", "Si è verificato un errore durante il recupero del nome dello schema predefinito."}, {"R_setSchemaWarning", "Avviso: l\'oggetto setSchema non prevede alcuna operazione in questa versione del driver."}, {"R_updateCountOutofRange", "Il valore del conteggio di aggiornamento non è compreso nell\'intervallo."}, {"R_limitOffsetNotSupported", "La clausola OFFSET nella sequenza di escape della clausola LIMIT non è supportata."}, {"R_limitEscapeSyntaxError", "Si è verificato un errore nella sintassi di escape della clausola LIMIT. L\'analisi della query non è riuscita."}, {"R_featureNotSupported", "La funzionalità {0} non è supportata."}, {"R_zoneOffsetError", "Si è verificato un errore durante il recupero della differenza di fuso orario."}, {"R_invalidMaxRows", "Il numero massimo di righe supportato per un set di risultati è Integer.MAX_VALUE o inferiore."}, {"R_schemaMismatch", "Gli schemi di origine e di destinazione non corrispondono."}, {"R_invalidColumn", "La colonna {0} non è valida. Verificare i mapping delle colonne."}, {"R_invalidDestinationTable", "Il nome della tabella di destinazione è mancante o non è valido."}, {"R_unableRetrieveColMeta", "Non è possibile recuperare i metadati della colonna."}, {"R_invalidDestConnection", "La connessione di destinazione deve essere una connessione da Microsoft JDBC Driver for SQL Server."}, {"R_unableRetrieveSourceData", "Non è possibile recuperare i dati dall\'origine."}, {"R_BulkTypeNotSupported", "Il tipo di dati {0} non è supportato nell\'\'operazione di copia bulk."}, {"R_invalidTransactionOption", "L\'opzione UseInternalTransaction non può essere impostata su TRUE se è usata con un oggetto Connection."}, {"R_invalidNegativeArg", "L\'\'argomento {0} non può essere negativo."}, {"R_BulkColumnMappingsIsEmpty", "Non è possibile eseguire l\'operazione di copia bulk se l\'unico mapping è una colonna Identity e l\'oggetto KeepIdentity è impostato su false."}, {"R_BulkCSVDataSchemaMismatch", "I dati di origine non corrispondono allo schema di origine."}, {"R_BulkCSVDataDuplicateColumn", "I nomi di colonna duplicati non sono consentiti."}, {"R_invalidColumnOrdinal", "La colonna {0} non è valida. Il numero della colonna deve essere maggiore di zero."}};


   protected Object[][] getContents() {
      return contents;
   }

}
