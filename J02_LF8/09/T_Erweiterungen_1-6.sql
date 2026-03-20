#--- Erweiterung 1

CREATE TABLE T_Adressen (
  pf_gamer_id 	CHAR(10) 	NOT NULL,
  plz 		CHAR(5) 	NOT NULL,
  ort 		VARCHAR(60) 	NOT NULL,
  strasse 	VARCHAR(60) 	NOT NULL,
  hausnummer 	VARCHAR(13) 	NOT NULL,
  PRIMARY KEY (pf_gamer_id),
  FOREIGN KEY (pf_gamer_id) REFERENCES T_Gamer (p_gamer_id)
    ON UPDATE CASCADE
    ON DELETE CASCADE
);

#--- Erweiterung 2

CREATE TABLE T_Aktivitaeten (
  p_aktivitaets_id SMALLINT NOT NULL,
  bezeichnung VARCHAR(255) NOT NULL,
  PRIMARY KEY (p_aktivitaets_id)
);

CREATE TABLE T_Systemlogs (
  p_log_id BIGINT UNSIGNED NOT NULL AUTO_INCREMENT,
  ipv4 BIT(32) NOT NULL,
  zeitstempel DATETIME NOT NULL,
  f_gamer_id CHAR(10) NOT NULL,
  f_aktivitaet SMALLINT NOT NULL,
  PRIMARY KEY (p_log_id),
  FOREIGN KEY (f_gamer_id) REFERENCES T_Gamer (p_gamer_id)
    ON UPDATE CASCADE
    ON DELETE CASCADE,
  FOREIGN KEY (f_aktivitaet) REFERENCES T_Aktivitaeten (p_aktivitaets_id)
    ON UPDATE CASCADE
    ON DELETE CASCADE
);

#--- Erweiterung 3

CREATE TABLE T_Tarifklassen (
  p_bezeichnung VARCHAR(30) NOT NULL,
  grundgebuehr DECIMAL(5,2) NOT NULL,
  gebuehr_pro_nachricht DECIMAL(5,2) NOT NULL,
  PRIMARY KEY (p_bezeichnung)
)

ALTER TABLE T_Gamer ADD f_bezeichnung VARCHAR(30);
ALTER TABLE T_Gamer 
  ADD FOREIGN KEY (f_bezeichnung) 
    REFERENCES T_Tarifklassen (p_bezeichnung) 
    ON DELETE SET NULL ON UPDATE CASCADE;

#--- Erweiterung 4

CREATE TABLE T_Premiumgamer (
  pf_gamer_id CHAR(10) NOT NULL,
  seit DATETIME NOT NULL,
  status TEXT,
  PRIMARY KEY (pf_gamer_id),
  FOREIGN KEY (pf_gamer_id) REFERENCES T_Gamer (p_gamer_id)
    ON UPDATE CASCADE
    ON DELETE CASCADE
);

CREATE TABLE T_Konten (
  pf_gamer_id CHAR(10) NOT NULL,
  iban VARCHAR(40) NOT NULL,
  bic VARCHAR(12) NOT NULL,
  inhaber VARCHAR(60) NOT NULL,
  einzugsermaechtigung BIT(1) NOT NULL,
  PRIMARY KEY (pf_gamer_id),
  FOREIGN KEY (pf_gamer_id) REFERENCES T_Premiumgamer (pf_gamer_id)
    ON UPDATE CASCADE
    ON DELETE CASCADE
);

CREATE TABLE T_Zahlungseingaenge (
  p_zahlungs_id INTEGER UNSIGNED NOT NULL AUTO_INCREMENT,
  betrag DECIMAL(9,2) NOT NULL,
  verwendungszweck VARCHAR(255),
  datetime DATETIME NOT NULL,
  f_gamer_id CHAR(10) NOT NULL,
  PRIMARY KEY (p_zahlungs_id),
  FOREIGN KEY (f_gamer_id) REFERENCES T_Premiumgamer (pf_gamer_id)
    ON UPDATE CASCADE
    ON DELETE CASCADE
);

#--- Erweiterung 5

CREATE TABLE T_Nachricht (
  p_nachricht_id INTEGER UNSIGNED NOT NULL AUTO_INCREMENT,
  status TEXT,
  inhalt LONGBLOB NOT NULL,
  empfang_am DATETIME NOT NULL,
  gesendet_am DATETIME NOT NULL,
  f_gamer_id CHAR(10) NOT NULL,
  PRIMARY KEY (p_nachricht_id),
  FOREIGN KEY (f_gamer_id) REFERENCES T_Gamer (p_gamer_id)
    ON UPDATE CASCADE
    ON DELETE CASCADE
);

CREATE TABLE T_Schreiben (
  pf_nachricht_id INTEGER UNSIGNED,
  preispronachricht DECIMAL(5,2) NOT NULL,
  f_gamer_id CHAR(10) NOT NULL,
  PRIMARY KEY (pf_nachricht_id),
  FOREIGN KEY (pf_nachricht_id) REFERENCES T_Nachricht (p_nachricht_id)
    ON UPDATE CASCADE
    ON DELETE CASCADE,
  FOREIGN KEY (f_gamer_id) REFERENCES T_Gamer (p_gamer_id)
    ON UPDATE CASCADE
    ON DELETE SET NULL
);

#---  Erweiterung 6

CREATE TABLE T_Gamer_Gamer_Befreunden (
  pf_gamer_a_id CHAR(10) NOT NULL,
  pf_gamer_b_id CHAR(10) NOT NULL,
  seit DATETIME NOT NULL,
  status TEXT, 
  freundschaftsgrad TINYINT,
  PRIMARY KEY (pf_gamer_a_id, pf_gamer_b_id),
  FOREIGN KEY (pf_gamer_a_id) REFERENCES T_Gamer (p_gamer_id)
    ON UPDATE CASCADE
    ON DELETE CASCADE,
  FOREIGN KEY (pf_gamer_b_id) REFERENCES T_Gamer (p_gamer_id)
    ON UPDATE CASCADE 
    ON DELETE CASCADE
);

#--- Done!