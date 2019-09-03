create database ChampionsChallengeProject;
create table ChampionsChallengeProject.clubs (Id_Club int NOT NULL primary key, nom varchar (20), clubcode varchar (3), countrycode varchar (3), groupe varchar (3), rate int); 

INSERT INTO ChampionsChallengeProject.clubs (nom, clubcode, countrycode, groupe, rate)
values ('Paris Saint Germain', 'psg', 'FRA', 'A', '9'),
 ('Real Madrid', 'rea', 'ESP', 'A', '8'), 
  ('Galatasaray', 'gal', 'TUR', 'A', '4'),
 ('Bruges', 'bru', 'BEL', 'A', '3');

INSERT INTO ChampionsChallengeProject.clubs (nom, clubcode, countrycode, groupe, rate)
values ('Bayern Munich', 'bay', 'ALL', 'B', '9'),
  ('Tottenham', 'tot', 'ANG', 'B', '8'),
   ('Etoile Rouge', 'eto', 'SER', 'B', '3'),
 ('Olympiakos', 'oly', 'GRE', 'B', '3');

INSERT INTO ChampionsChallengeProject.clubs (nom, clubcode, countrycode, groupe, rate)
values ('Manchester city', 'man', 'ANG', 'C', '9'),
  ('Atalanta Bergame', 'ata', 'ITA', 'C', '6'),
 ('Shakhtar donetsk', 'sha', 'UKR', 'C', '6'),
 ('Dinamo Zagreb', 'din', 'CRO', 'C', '3');

INSERT INTO ChampionsChallengeProject.clubs (nom, clubcode, countrycode, groupe, rate)
values ('Juventus Turin', 'juv', 'ITA', 'D', '9'),
  ('Atletico Madrid', 'atl', 'ESP', 'D', '8'),
 ('Bayern leverkusen', 'bay', 'ALL', 'D', '6'),
 ('Lokomotiv Moscou', 'lov', 'RUS', 'D', '3');

INSERT INTO ChampionsChallengeProject.clubs (nom, clubcode, countrycode, groupe, rate)
values ('Liverpool', 'liv', 'ANG', 'E', '9'),
  ('Naples', 'nap', 'ITA', 'E', '7'),
 ('Salzbourg', 'sal', 'AUT', 'E', '5'),
 ('Genk', 'gen', 'BEL', 'E', '3');

INSERT INTO ChampionsChallengeProject.clubs (nom, clubcode, countrycode, groupe, rate)
values ('Barcelone', 'bar', 'ESP', 'F', '9'),
  ('Dortmund', 'dor', 'ALL', 'F', '8'),
 ('Inter', 'int', 'ITA', 'F', '7'),
 ('Slavia Prague', 'sla', 'REP', 'F', '3');
 
INSERT INTO ChampionsChallengeProject.clubs (nom, clubcode, countrycode, groupe, rate)
values ('Zenith', 'zen', 'RUS', 'G', '6'),
  ('Benfica', 'ben', 'POR', 'G', '7'),
 ('Lyon', 'lyo', 'FRA', 'G', '7'),
 ('Leipzig', 'lei', 'ALL', 'G', '6');
 
INSERT INTO ChampionsChallengeProject.clubs (nom, clubcode, countrycode, groupe, rate)
values ('Chelsea', 'che', 'ANG', 'H', '7'),
  ('Ajax Amsterdam', 'aja', 'PAY', 'H', '7'),
 ('Valence', 'val', 'ESP', 'H', '6'),
 ('Lille', 'lil', 'FRA', 'H', '6');
 
 SELECT * from ChampionsChallengeProject.clubs order by Id_Club;

