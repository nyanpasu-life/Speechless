import './App.css';

import { BrowserRouter, Route, Routes } from 'react-router-dom';
import { IndexPage } from './containers/layout/IndexPage.tsx';
import { Header } from './containers/layout/Header.tsx';
import { Footer } from './containers/layout/Footer.tsx';
import { createTheme, ThemeProvider } from '@mui/material';

const theme = createTheme({
	palette: {
		primary: {
			main: '#9F7AEA'
		},
		secondary: {
			main: '#FFFFFF'
		}
	},
});

export default function App() {
	return (
		<ThemeProvider theme={theme}>
			<Header></Header>
			<BrowserRouter>
				<Routes>
					<Route path='/' element={<IndexPage />} />
				</Routes>
			</BrowserRouter>
			<Footer></Footer>
		</ThemeProvider>
	);
}
