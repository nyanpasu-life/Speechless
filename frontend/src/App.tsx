import './App.css';

import { ChakraProvider, extendTheme } from '@chakra-ui/react';

const colors = {
	primary: {
		// TODO: Design System Color 정하기
		100: '#E2E2FF',
		200: '#8884FF',
		300: '#38369A',
		400: '#1D1D6E',
		500: '#131357',
	}
}

const theme = extendTheme({ colors });

export default function App() {
	return (
		<ChakraProvider resetCSS theme={theme}>

		</ChakraProvider>
	);
}