create table ChampionsChallengeProject.joueurs (Id_Joueur int NOT NULL primary key, nom varchar (15), prenom varchar (15), poste varchar (10), codeposte varchar (3), countrycode varchar (3), club varchar (20), Id_club int, rate int);

Alter table ChampionsChallengeProject.joueurs
Add constraint Id_Club foreign key(Id_Club) references ChampionsChallengeProject.clubs(Id_Club);

DELETE from ChampionsChallengeProject.joueurs where Id_Joueur= '4'; 
SELECT * from ChampionsChallengeProject.joueurs order by rate ASC;
Select * from ChampionsChallengeProject.joueurs where club ='PSG';

INSERT INTO ChampionsChallengeProject.joueurs (nom, prenom, poste, codeposte, countrycode, club, Id_club, rate)
values ('Navas', 'Keylor', 'gardien', 'gar', 'COS', 'PSG', '1','30'),('Rico', 'Sergio', 'gardien', 'gar', 'ESP', 'PSG', '1','10'),
('Bulka', 'Marcin', 'gardien', 'gar', 'POL', 'PSG', '1','5'), ('Dagba', 'Colin', 'defenseur', 'def', 'FRA', 'PSG', '1','15'),
('Bernat', 'Juan', 'defenseur', 'def', 'ESP', 'PSG', '1','30'),('Diallo', 'Abdou', 'defenseur', 'def', 'FRA', 'PSG', '1','40'),
('Kehrer', 'Thilo', 'defenseur', 'def', 'ALL', 'PSG', '1','20'),('Kimpembe', 'Presnel', 'defenseur', 'def', 'FRA', 'PSG', '1','30'),
('Kurzawa', 'Laywin', 'defenseur', 'def', 'FRA', 'PSG', '1','20'),('Marquinhos', '', 'defenseur', 'def', 'BRA', 'PSG', '1','40'),
('Meunier', 'Thomas', 'defenseur', 'def', 'BEL', 'PSG', '1','30'),('Silva', 'Thiago', 'defenseur', 'def', 'BRE', 'PSG', '1','40'),
('Aouchiche', 'Adil', 'milieu', 'mil', 'FRA', 'PSG', '1','8'),('Draxler', 'Julian', 'milieu', 'mil', 'ALL', 'PSG', '1','30'),
('Gueye', 'Idrissa', 'milieu', 'mil', 'SEN', 'PSG', '1','35'),('Herrera', 'Ander', 'milieu', 'mil', 'ESP', 'PSG', '1','25'),
('Paredes', 'Leandro', 'milieu', 'mil', 'ARG', 'PSG', '1','30'),('Sarabia', 'Pablo', 'milieu', 'mil', 'ESP', 'PSG', '1','40'), 
('Verrati', 'Marco', 'milieu', 'mil', 'ITA', 'PSG', '1','50'),('Cavani', 'Edinson', 'attaquant', 'att', 'URU', 'PSG', '1','60'),
('Chupo-Moting', 'Eric', 'attaque', 'att', 'CAM', 'PSG', '1','40'),('Di maria', 'Angel', 'attaquant', 'att', 'ARG', 'PSG', '1','60'),
('Icardi', 'Mauro', 'attaquant', 'att', 'ARG', 'PSG', '1','60'),('Mbappe', 'Kylian', 'attaquant', 'att', 'FRA', 'PSG', '1','70'),
('Neymar', '', 'attaquant', 'att', 'BRA', 'PSG', '1','70');